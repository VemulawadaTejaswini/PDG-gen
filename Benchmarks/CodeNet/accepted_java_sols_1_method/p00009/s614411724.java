import java.util.*;

class Main{
    public static void main(String[] args){
        boolean[] IsSosu = new boolean[1000000];
        Arrays.fill(IsSosu, true);
        IsSosu[0] = IsSosu[1] = false;
        
        for(int i=2;i<=1000;i++){
            if(!(IsSosu[i]))
                continue;
            else{
                for(int j=i*2; j<1000000; j += i){
                    IsSosu[j] = false;
                }
            }
        }
        int[] SosunoKosu = new int[1000000];
        SosunoKosu[0] = 0;
        for(int i=1;i<SosunoKosu.length;i++){
            int plus = IsSosu[i]?1:0;
            SosunoKosu[i] = SosunoKosu[i-1] + plus;
        }
        
        
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            System.out.println(SosunoKosu[n]);
        }
    }
}