import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] str = (sc.nextLine()).split(" ");
	    if(str[0].equals("0")) break;
	    int res = 0, one = 0;

	    for(int i = 0; i < str.length; i++){
		int cd = Integer.parseInt(str[i]);
		if(cd > 10) cd = 10;
		if(cd == 1){
		    cd = 11;
		    one++;
		}
		res += cd;
		if(res > 21){
		    while(one > 0 && res > 21){
			one--;
			res-=10;
		    }
		    if(res > 21){
			res = 0;
			break;
		    }
		}
	    }
	    
	    System.out.println(Integer.toString(res));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}