import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
if(b >= 100 ) a *= 1000;
else if (b >= 10 ) a *= 100;
else a *= 10;
a = a + b;
for(int i=1; i<320 ; i++){
  if(i*i == a) {
    a = -1;
    break;
   }
}//for
if (a == -1) System.out.print("Yes");
else         System.out.print("No");
}//main
}//Main