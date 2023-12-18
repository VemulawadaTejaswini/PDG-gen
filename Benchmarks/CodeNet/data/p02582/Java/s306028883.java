import java.util.Scanner;
class main{
	public static void main(String[] args){
		
		
		int a=0;
		
		Scanner sc1 = new Scanner(System.in);
 		String S = sc1.nextLine();
       		String[] str = new String[S.length()];
		for (int i = 0; i < S.length(); i++) {
   		
  		String str2 = String.valueOf(S.charAt(i));
    		
    		str[i] = str2;
		}
		for(int j=0;j<S.length();j++){

			try{
			
				if(str[j].equals("R")&&str[j+1].equals("R")){
					
						a++;
					
				}
				else if(str[j].equals("R")&&!(str[j+1].equals("R"))){
					a++;
				}
			}
			catch(Exception e){
				break;
			}

				
				
				
			
		}
		System.out.println(a);
	}
}
		

		
