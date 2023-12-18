import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //System.out.println(max(12345,5)+" "+min(12345,5));
        loop:
        while(true){
            int[] suretu = new int[20];
            int a = Integer.parseInt(sc.next());
            int L = Integer.parseInt(sc.next());
            if(a==0&&L==0)break;
            suretu[0]=a;
            for(int i=1;i<20;i++){
                suretu[i]=max(suretu[i-1],L)-min(suretu[i-1],L);
                for(int j=0;j<i;j++){
                    if(suretu[i]==suretu[j]){
                        System.out.println(j+" "+suretu[j]+" "+(i-j));
                        continue loop;
                    }
                }
            }
        } 
    }
    
    static int max(int kazu,int L){
        String retu = Integer.toString(kazu);
        char[] naraberu = retu.toCharArray();
        int[] harahetta = new int[naraberu.length];
        for(int i=0;i<naraberu.length;i++){
            harahetta[i]=Integer.parseInt(naraberu[i]+"");
        }
        Arrays.sort(harahetta);
        
        String narabeta="";
        for(int i=0;i<harahetta.length;i++){
            narabeta += Integer.toString(harahetta[harahetta.length-1-i]);
        }
        while(true){
            if(narabeta.length()==L){
                break;
            }else{
                narabeta += "0";
            }
        }
        int kaesu = Integer.parseInt(narabeta);
        return kaesu;
    }
    
    static int min(int kazu,int L){
        String retu = Integer.toString(kazu);
        char[] naraberu = retu.toCharArray();
        Arrays.sort(naraberu);
        String narabeta="";
        for(int i=0;i<naraberu.length;i++){
            narabeta += naraberu[i]+"";
        }
        
        int kaesu = Integer.parseInt(narabeta);
        
        return kaesu;
    }
    
}