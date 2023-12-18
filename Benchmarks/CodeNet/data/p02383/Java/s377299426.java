import java.util.Scanner; 
public class Main { 
public static void main(String args[]) { 
    int n[]=new int[6];
Scanner sc = new Scanner(System.in); 
    for(int i=0;i<6;i++){
        n[i]=sc.nextInt();
    }
    String s = sc.next();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='N'){
            n=north(n);
        }else if(s.charAt(i)=='S'){
            n=south(n);
        }else if(s.charAt(i)=='E'){
            n=east(n);
        }else if(s.charAt(i)=='W'){
            n=west(n);
        }
    }
    System.out.println(n[0]);

 }
 public static int[] north(int[] n){
     int temp = n[0];
     n[0]=n[1];
     n[1]=n[5];
     n[5]=n[4];
     n[4]=temp;
     return n;
 }
  public static int[] south(int[] n){
     int temp = n[0];
     n[0]=n[4];
     n[4]=n[5];
     n[5]=n[1];
     n[1]=temp;
     return n;
 }
    public static int[] west(int[] n){
     int temp = n[0];
     n[0]=n[2];
     n[2]=n[5];
     n[5]=n[3];
     n[3]=temp;
     return n;
 }
   public static int[] east(int[] n){
     int temp = n[0];
     n[0]=n[3];
     n[3]=n[5];
     n[5]=n[2];
     n[2]=temp;
     return n;
 }
}
