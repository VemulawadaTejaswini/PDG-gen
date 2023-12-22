import java.util.*;

public class Main
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int w = sc.nextInt();
	    int n = sc.nextInt();

	    int[] lots = new int[w];
	    for(int i = 1; i <= w; ++i){
		lots[i-1] = i;
	    }

	    while(0 < n--){
		String[] horizontal_line = sc.next().split(",");
		swapVerticalLines(lots, Integer.parseInt(horizontal_line[0])-1, Integer.parseInt(horizontal_line[1])-1);
	    }

	    for(int i = 0; i < w; ++i){
		System.out.println(String.valueOf(lots[i]));
	    }
	}
    }

    private static void swapVerticalLines(int[] lots, int line1, int line2){
	int tmp = lots[line1];
	lots[line1] = lots[line2];
	lots[line2] = tmp;
    }
}