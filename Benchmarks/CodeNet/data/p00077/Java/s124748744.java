import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			String str="";
			for(int i=0;i<c.length;i++){
				if(c[i]=='@'){
					for(int j=0;j<Integer.parseInt(c[i+1]+"");j++){
						str+=(c[i+2]+"");
					}
					i+=2;
				}else{
					str+=(c[i]+"");
				}
			}
			System.out.println(str);
		}
	}
}