import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String name = in.next();
		int cnt=0;
		for(int s=0;s<n;s++){
			boolean sw=false;
			String a = in.next();
			for(int i=0;i<a.length();i++){//初期位置
				if(a.charAt(i)!=name.charAt(0))continue;
				for(int k=1;k<a.length();k++){
					String test="";
					for(int g=i;g<a.length();g+=k){
						if(test.length()>name.length())break;
						test+=a.charAt(g);
						if(test.equals(name)){
							sw=true;
							break;
						}
					}
					if(sw==true)break;
				}
				if(sw==true)break;
			}
			if(sw==true)cnt++;
		}
		System.out.println(cnt);
	}
}