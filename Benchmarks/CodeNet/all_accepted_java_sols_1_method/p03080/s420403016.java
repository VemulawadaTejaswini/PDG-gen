import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        String caps = sc.next();
        String[] capsArray = caps.split("");
        int r = 0;
       int b = 0;
for(String cap : capsArray){
   if(cap.equals("R")){
      r += 1;
   }else{
      b += 1;
   }
}
   
if(r > b){
    System.out.println("Yes"); 
}else{
    System.out.println("No");
}
    }
}