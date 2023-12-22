import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int a,b;
      a = sc.nextInt();
      b = sc.nextInt();

       int sum = a * b;

       int arr [] = {1,2,3};
       boolean flg = false;

for(int i = 0; i < arr.length; i++) {
                if((sum * arr[i]) % 2 == 1) {
                           flg = true;
           
        } else {
                flg = false;
         }
}

if(flg == true) {
  System.out.println("Yes");
} else {
     System.out.println("No");
}

  }
}