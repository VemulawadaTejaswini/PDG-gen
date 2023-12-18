import java.util.Scanner;                      

class Main {                                  
public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);      
 
		
		
		while(true){
			
			String x = scanner.next();
			
			if(x.equals("0")){
				break;//終了条件
			}

			char[] a; 
			a=new char[x.length()];//配列の最大値は桁数＝文字数
			int sum=0;
			for(int i=0;i < x.length();i++){//桁数分くりかえす
				
				a[i]=x.charAt(i);
				
			    sum=sum+Character.getNumericValue(a[i]);//charの数字を対応するint型に変換し加算
			    
			}

			System.out.println(sum);
		
			}

		scanner.close();

	}


	}

