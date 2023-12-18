import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String str;
		Converter c;
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			c = new Converter();
			str = "";
			for(int i=0;i<n;i++){
				c.setData(sc.next(),sc.next());
			}
			
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				str += sc.next();
			}
			
			System.out.println(c.convert(str));
		}
	}
}

class Converter{
	int[] data;
	
	Converter(){
		data = new int[123];
	}
	
	public void setData(String before,String after){
		data[(int)before.charAt(0)] = (int)after.charAt(0);
	}
	
	public String convert(String str){
		String convertStr = "";
		
		for(int i=0;i<str.length();i++){
			if(data[(int)str.charAt(i)] != 0){
				convertStr += (char)data[(int)str.charAt(i)];
			}else{
				convertStr += str.charAt(i);
			}
		}
		
		return convertStr;
	}
}