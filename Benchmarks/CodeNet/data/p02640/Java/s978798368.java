public class Main {
	public static void main(String[] args){
      	Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
 		int y = scan.nextInt();
      String ans = "No";
      
      if(y%2 == 0 && y/2 >= x && y/4 <= x) {
    	  ans = "Yes";
      }

//		for(int i=0; i<9; i++){
//			
//			}
//        Arrays.sort(priceArray);
//      	for(int i=0; i<kounyu; i++){
//			ans += priceArray[i];
//			}

		System.out.println(ans);   
 
	}
}