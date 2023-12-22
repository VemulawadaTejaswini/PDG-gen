import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	
        int[] array = new int[200];
        for(int i = 0 ; i < n ; i ++){
          array[i] = sc.nextInt();
        }
      	int count = 0;
      	boolean flg = true;
      while(flg){
      	for(int i = 0 ; i < n ; i++){
        	if(array[i] % 2 != 0){
            	flg = false;
              break;
            }
          	array[i] /= 2;
        }
        if(!flg) {
        	break;
        }
      	count ++;
      }
      
System.out.print(count);


    }
}
