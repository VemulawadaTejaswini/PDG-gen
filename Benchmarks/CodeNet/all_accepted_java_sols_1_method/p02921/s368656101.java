import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int ans=0;
        String s = sc.next();
        String t = sc.next();
        char[] ca = s.toCharArray();
        char[] cb = t.toCharArray();
for(int i=0;i<3;i++){
	if(ca[i]==cb[i]){
		ans++;
	}
}
        System.out.println(ans);
    }
}
