import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int K = sc.nextInt();

        char target = S.charAt(K-1);

        String ret="";
        for(int i=0;i<N;i++){
            if(S.charAt(i)==target){
                ret+=target;
            }else{
                ret+='*';
            }
        }
        System.out.println(ret);
    }
}