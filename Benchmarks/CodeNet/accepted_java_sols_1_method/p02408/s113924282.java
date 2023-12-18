import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);

       int n=scan.nextInt();
       /*0~12 S, 13~25 H, 26~38 C, 39~51 D*/
       boolean cards[] =new boolean[52];
       for(int i=0;i<52;i++){
           cards[i]=true;
       }
       for(int j=0;j<n;j++){
           String Mark=scan.next();
           int num=scan.nextInt();

           if (Mark.equals("S")) {
               cards[num-1]=false;
           }
           if (Mark.equals("H")) {
               cards[13+num-1]=false;
           }
           if (Mark.equals("C")) {
               cards[13*2+num-1]=false;
           }
           if (Mark.equals("D")) {
               cards[13*3+num-1]=false;
           }
       }
       for(int k=0;k<52;k++){
           if(cards[k]){
               if(k<13){
                   System.out.println("S "+(k+1));
               }else if(k>=13 && k<26){
                   System.out.println("H "+(k-12));
               }else if(k>=26 && k<39) {
                   System.out.println("C "+(k-25));
               }else if(k>=39){
                   System.out.println("D "+(k-38));
               }
           }
       }
    }
}

