import java.util.*;
 
class Main{
    public static void main(String agrs[]){
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println(a + " " +b + " " + c);
if(a<b && b<c){
        System.out.print("YES");
}else{
        System.out.print("NO");
}
    }
}