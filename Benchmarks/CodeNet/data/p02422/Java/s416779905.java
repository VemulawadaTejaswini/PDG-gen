import java.util.*;

class Main{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int q = Integer.parseInt(sc.nextLine());
		for(int i=0;i<q;i++){
			String[] line=sc.nextLine().split(" ");
			int a=Integer.parseInt(line[1]);
			int b=Integer.parseInt(line[2]);
		//index	
			int index=0;
			if(line[0].equals("print")){
				index=1;
			}else if(line[0].equals("reverse")){
				index=2;
			}else if(line[0].equals("replace")){
				index=3;
			}
			switch(index){
				case 1:
					System.out.println(str.substring(a,b+1));
					break;
				case 2:
					String[] strReverse = new String[b-a+1];
					for(int j=0;j<b-a+1;j++){
						strReverse[j]=String.valueOf(str.charAt(a));
					}
					for(int j=b-a;j>0;j--){
						sb.append(strReverse[j]);
					}
					String str1=str.substring(0,a);
					String str2=str.substring(b+1);
					str = str1+sb.toString()+str2;
					break;	
				case 3:
					String str3=str.substring(0,a);
					String str4=str.substring(b+1);
					str = str3+line[3]+str4;
					break;
			}
		}
	}
}