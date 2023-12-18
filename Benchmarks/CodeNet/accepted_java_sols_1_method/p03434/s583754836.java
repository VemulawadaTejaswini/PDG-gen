import java.util.*;


class Main{
	public static void main(String[] args){
   	 Scanner sc = new Scanner(System.in);
   	 int[] array = new int[10000];
  	 int N = sc.nextInt();
   	 int Allice = 0;
     int Bob = 0;
     for (int i=0; i< N; ++i){
    	array[i] = sc.nextInt(); 
   	 }
     Arrays.sort(array,0,N);
     for (int i=N-1; i >= 0; i=i-2){
     Allice += array[i];
     }
     for (int i=N-2; i >= 0; i=i-2){
     Bob += array[i];
     }
     System.out.println(Allice-Bob);
     
    }
  
}