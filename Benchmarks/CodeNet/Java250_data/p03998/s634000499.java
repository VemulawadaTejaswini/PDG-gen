import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sa =sc.nextLine();
        String Sb =sc.nextLine();
        String Sc =sc.nextLine();
        
        String sptA[]=Sa.split("");
        String sptB[]=Sb.split("");
        String sptC[]=Sc.split("");
        
        String next="a";
        
        int i=0;
        int j=0;
        int k=0;
        
        while(true){
            if(next.equals("a")){
                if(i==sptA.length){
                    System.out.println("A");
                    return;
                }
                next=sptA[i];
                i++;
            }
            
            if(next.equals("b")){
                if(j==sptB.length){
                    System.out.println("B");
                    return;
                }
                next=sptB[j];
                j++;
            }
            
            if(next.equals("c")){
                if(k==sptC.length){
                    System.out.println("C");
                    return;
                }
                next=sptC[k];
                k++;
            }
            
        }
        
   }
}
