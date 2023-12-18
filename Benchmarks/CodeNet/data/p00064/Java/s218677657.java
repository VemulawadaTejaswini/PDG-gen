import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			for(int i=0;i<c.length;i++){
				if(intJudge(c[i])){
					String str=c[i]+"";
					for(int j=i+1;j<c.length;j++){
						if(intJudge(c[j])){
							str+=(c[j]+"");
						}else{
							break;
						}
						i=j;
					}
					sum+=Integer.parseInt(str);
				}
			}
			System.out.println(sum);
		}
	}
	static boolean intJudge(char c){
		try{
			Integer.parseInt(c+"");
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}