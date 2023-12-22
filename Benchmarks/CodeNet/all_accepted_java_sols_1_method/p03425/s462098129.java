import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
        String name[] = new String[n];
		for(int t = 0;t<n;t++) {
			name[t] = scanner.next();
            name[t] = String.valueOf(name[t].charAt(0));
        }
        int x = 0;
		Long amnt[] = {0L,0L,0L,0L,0L};
        String moji[] = {"M","A","R","C","H"};
        int s;
        for(x = 0;x < n;x++){
          	for(s = 0;s<5;s++){
         		if(moji[s].equals(name[x])){
                  amnt[s]++;
                }
            }
        }
		Long ans = amnt[0]*(amnt[1]*(amnt[2]+amnt[3]+amnt[4])+amnt[2]*(amnt[3]+amnt[4])+amnt[3]*amnt[4])+amnt[1]*(amnt[2]*amnt[3]+amnt[2]*amnt[4]+amnt[3]*amnt[4])+amnt[2]*amnt[3]*amnt[4];
       System.out.println(ans);
    }
}