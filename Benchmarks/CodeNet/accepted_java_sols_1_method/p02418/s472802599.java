import java.util.Scanner;                      


class Main {



	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);


			String s= scanner.nextLine();//文字列sの入力
			String p= scanner.nextLine();//文字列pの入力
			
		
			char[] chars; 
			chars=new char[s.length()];//文字列sを格納する配列chars
			String[] Strings;
			Strings=new String[s.length()];
			String compare="";//文字列pと比較する変数
			boolean anther =false; 
			
			for(int i=0;i < s.length();i++){//桁数分くりかえす
				chars[i]=s.charAt(i);//文字列を1文字ずつ配列に格納
				Strings[i]=String.valueOf(chars[i]);//String型に変換
			}

			int loop=0;//ループを制御する変数
			for(int i =0;i<s.length();i++){
				loop=i;
			for(int ii=i;ii<p.length()+i;ii++){
				 
				
				if(loop == s.length()){
					loop=0;
				}
				
				compare = compare.concat(Strings[loop]);	
				
				loop=loop+1;
				
				if(compare.equals(p)){
					anther=true;
				}
				
				}
			compare="";
			}
				if(anther){
					System.out.println("Yes");
				}
				
				else{
					System.out.println("No");
				}


		scanner.close();


	}
}

