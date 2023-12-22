import java.util.Scanner;
public class Main {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
          
   int handred = N/100;
   int ten = (N/10)%10;//例)123/100=1と23、23%10(23の10の位抽出)=2
   int one = N%10;
                  
        if(handred ==7 ){
          System.out.println("Yes");
        }else if(ten ==7){
          System.out.println("Yes");
        }else if(one ==7){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}