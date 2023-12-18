import java.util.*;
public class Main{
	public static char[] str,front={'(','[','{'},back={')',']','}'};
	public static int i,len;
	public static int check(int n){
		while(i<len){
			for(int j=0;j<3;j++){
				if(str[i]==front[j]){
					i++;
					if(check(j)==0){
						return 0;
					}
				}
				else if(str[i]==back[j]){
					if(j==n){
						return 1;
					}
					else{
						return 0;
					}
				}
			}
			i++;
		}
		if(n!=3){
			return 0;
		}
		return 1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			String s=sc.nextLine();
			len=s.length();
			if(len==1&&s.charAt(0)=='.'){
				break;
			}
			i=0;
			str=s.toCharArray();
			if(check(3)==1){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}
}
