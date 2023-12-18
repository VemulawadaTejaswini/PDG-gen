import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 int N = sc.nextInt();
         int L[]= new int[N];
         int set=0;
         int total =0;
         int hoge =0;
         for(int i = 0;i<N;i++){
        	 L[i]=sc.nextInt();
        	 hoge = L[0];
           if(L[i]>set){
        	   total += set;
        	   set = L[i];

           }else{
        	   total += L[i];
           }
         }

         if(total>set){
        	 System.out.println("Yes");
         }else{
        	 System.out.println("No");
         }






    }

}