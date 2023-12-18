import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){
	    int max = 100;
	    String line = sc.next();
	    String line2 = sc.next();
	    if(line.length()<80 && line2.length()<80){
		int[] one = new int[max];
		for(int i=0; i<line.length(); i++){
		    one[max-i-1] = Integer.parseInt(line.substring(line.length()-1-i,line.length()-i));
		}
		int[] two = new int[max];
		for(int i=0; i<line2.length(); i++){
		    two[max-i-1] = Integer.parseInt(line2.substring(line2.length()-1-i,line2.length()-i));
		}
		
		int[] ans = new int[max];
		for(int i=0; i<max; i++){
		    ans[max-i-1] += one[max-i-1]+two[max-i-1];
		    if(ans[max-i-1]>=10 && max-i-2>=0){
			int tmp = ans[max-i-1];
			ans[max-i-1] = tmp%10;
			ans[max-i-2] = (tmp-tmp%10)/10;
		    }
		}
		//System.out.println(Arrays.toString(ans));
		if(ans[0]>=10){
		    System.out.println("overflow");
		}else{
		    String finalAns = "";
		    int i=0;
		    while(ans[i]==0){
			i++;
		    }
		    for(int j=i; j<max; j++){
			finalAns+=ans[j];
			//System.out.print((int)ans[j]);
		    }
		    System.out.println(finalAns);
		}
	    }else{
		System.out.println("overflow");
	    }
	    n--;
	}
    }
}