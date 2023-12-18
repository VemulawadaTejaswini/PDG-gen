import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
		String mozi = "";
		for(int i = 0; i < s.length(); i++){
			char tmp = s.charAt(i);
			if('A' <= tmp && tmp <= 'Z' )
				mozi += (char)(tmp - 'A' + 'a');
			else if('a' <= tmp && tmp <= 'z')
				mozi += (char)(tmp - 'a' + 'A');
			else
				mozi += tmp;
		}
		System.out.println(mozi);
    }
}
