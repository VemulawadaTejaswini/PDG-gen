import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
 
        int N = stdIn.nextInt();
        String S = stdIn.next();
         String[] Stwo = S.split("");
        int count= 0;
 
         for(int i = 0;i<=N-3;i++){
             if(Stwo[i].equals("A")&&Stwo[i+1].equals("B")&&Stwo[i+2].equals("C")){
                 count +=1;
                 }
            }
        System.out.println(count);
    }
}
