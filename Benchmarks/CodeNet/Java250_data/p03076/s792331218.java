import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] foods = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            foods[i] = sc.nextInt();
        }
        sc.close();

        int[] yobun = new int[5];
        
        for(int k = 0 ; k < 5 ; k++){
            for(int i = 10 ;i < 140 ; i+=10){
                if(i-foods[k]>0 && i-foods[k]!=10){
                    yobun[k] = i-foods[k];
                    break;
                }else if(i-foods[k]==10){
                    yobun[k] = 0 ;
                    break;
                }
            }
        }
        Arrays.sort(yobun);
        int ans = 0;

        for(int i = 0; i < 5 ; i++){
            ans += foods[i];
            ans += yobun[i];
        }
        System.out.println(ans-yobun[4]);
    }
}