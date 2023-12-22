import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] H = new int[N];
        for(int i = 0 ; i < N ; i++){
            H[i] = sc.nextInt();
        }
        sc.close();
        int ans = 1;
        int count = 0 ;
        for(int i = 1 ; i < N ; i++){
          //  System.out.println("ans : "+ ans);
          //  System.out.println("i : "+ i);

            for(int j = 0 ; j < i ; j++){

               // System.out.println(H[i]);
              //  System.out.println(H[j]);

                if(H[i] < H[j]){
                    break;
                }else{
                    count ++;
                }
            }    

            if(count == i){
                ans ++;
            }
          //  System.out.println("count : "+ count);
            count = 0;
        }
        System.out.println(ans);
    }
}