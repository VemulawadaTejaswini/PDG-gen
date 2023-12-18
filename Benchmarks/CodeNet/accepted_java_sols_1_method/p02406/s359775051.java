import java.util.Scanner;
class Main
{
public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
  int i, n, x;
  n = sc.nextInt();     
  for(i =1; i<=n; i++){
   x = i;
   if(x % 3 == 0){
    System.out.printf(" %d", i);
    continue;
   }
   do{
    if(x % 10 == 3){
    System.out.printf(" %d", i);
    break;
   }
   x /= 10;
   }while(0 < x);
}
   System.out.println();
}  
}

