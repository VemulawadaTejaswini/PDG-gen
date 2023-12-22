import java.util.Scanner;
class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		String moji;
		int cnt=0;
		str=sc.next();
		moji=sc.next();
		while(moji.compareTo("END_OF_TEXT")!=0){
			if(moji.compareToIgnoreCase(str)==0){
				cnt++;
			}
			moji=sc.next();
		}
		System.out.println(cnt);
    }
}


