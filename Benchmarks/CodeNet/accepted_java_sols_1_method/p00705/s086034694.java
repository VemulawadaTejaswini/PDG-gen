import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();  // n人の委員がいて、
	    int q = kbd.nextInt();  // q人が過半数
	    if(n!=0 && q!=0){
		int[] date = new int[100];
		//会議の候補日は1日後以上100日後未満

		while(n!=0){
		    //委員一人一人について、
		    int s = kbd.nextInt(); // s日分の予定が空いていて、
		    while(s!=0){
			int a = kbd.nextInt(); // 具体的にはa日が可
			date[a]++;
			s--;
		    }
		    n--;
		}

		int ans = 0;
		for(int i=0; i<date.length; i++){
		    //その日に集まれる人数が過半数qを超えていて、かつ最も多い日を探す
		    if(date[i]>=q && date[ans]<date[i])
			ans = i;  //答えとして出力するのは人数
		}
		//過半数を超えていない限り、ansは0のまま
		System.out.println(ans);
	    }
	}
    }
}