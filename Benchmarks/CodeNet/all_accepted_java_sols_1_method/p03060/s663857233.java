import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sam[] = new int[A];
        int sam2 = 0;
        int sam3 = 0;

	  for(int i= 0;i<A;i++){
        sam[i] = sc.nextInt();
      }
	  for(int i= 0;i<A;i++){
        sam2 = sam[i]-sc.nextInt();
        if(sam2>0){
          sam3 += sam2;
        }
      }
      
		System.out.print(sam3);

    }
}