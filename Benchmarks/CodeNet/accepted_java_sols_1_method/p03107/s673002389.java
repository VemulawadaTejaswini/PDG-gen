import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int count0 = 0,count1=0;
        for(int i = 0;i<s.length;i++){
            if(s[i]=='0'){
                count0++;
            } else {
                count1++;
            }
        }
        System.out.println(Math.min(count0,count1)*2);
    }
}
