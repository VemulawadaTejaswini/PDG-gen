import java.util.Scanner;
class Main{
	public static void main(String[] args){
		
		
		int a=0;
		int b=0;
		
		Scanner sc1 = new Scanner(System.in);
 		String S = sc1.nextLine();
       		String[] str = new String[S.length()];
		for (int i = 0; i < S.length(); i++) {
   		
  		String str2 = String.valueOf(S.charAt(i));
    		
    		str[i] = str2;
		}
		for(int j=0;j<S.length();j++){
			

				if(str[j].equals("R")){
					a++;
					b=a;
				}
				else if(str[j].equals("S")){
					a=0;
					
				}
		}
		
					
				
			
			
		
				
				
				
			
		
		System.out.println(b);
	}
}
		

		
