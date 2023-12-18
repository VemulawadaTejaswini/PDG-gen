import java.util.*;
class Main{
       public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
int arr[] =new int[3];            
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
arr[0] = Math.abs(a-b);
arr[1] = Math.abs(b-c);
arr[2] = Math.abs(a-c);
Arrays.sort(arr);
System.out.println(arr[0]+arr[1]);
       }
}
