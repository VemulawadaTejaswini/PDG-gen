import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i ++){
          array[i] = sc.nextInt();
        }
      	Arrays.sort(array);
        int a = 0 ;
        int b = 0 ;
      	
      	for(int i = 1 ; i <= n ; i ++){
          if(i % 2 != 0){
          	a += array[n-i];
          }else{
          	b += array[n-i];
          }
        }
       System.out.print(a-b);
      
    }
}


