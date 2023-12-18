import java.util.*;

class Main{
    static List<String> list = new ArrayList<String>();
    static int[] kazuSet = {1000,100,10,1};

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	list.add("m");
	list.add("c");
	list.add("x");
	list.add("i");

	int kaisu = sc.nextInt();//vZw¦Ìñ

	while(kaisu!=0){
	    String mcxi0 = sc.next();
	    String mcxi1 = sc.next();

	    System.out.println(solve(mcxi0,mcxi1));

	    kaisu--;
	}
    }

    public static String solve(String mcxi0, String mcxi1){

	int sum = toInt(mcxi0) + toInt(mcxi1);

	String ans = toString(sum);

	return ans;
    }

    //MCXI¶ñðMCXIlÖ
    public static int toInt(String mcxi){
	int sum = 0;
	int kazu = 1;
	for(int i=0; i<mcxi.length(); i++){
	    if(!list.contains(mcxi.substring(i,i+1))){//iÔÚªÈç
		kazu = Integer.parseInt(mcxi.substring(i,i+1));
	    }
	    else{//iÔÚª¶Èç
		sum += kazu * kazuSet[list.indexOf(mcxi.substring(i,i+1))];
		kazu = 1;
	    }
	}
	return sum;
    }

    //MCXIlðMCXI¶ñÖ
    public static String toString(int sum){
	String mxci = "";
	int[] suzi = new int[4];
	//1000A100A10A1ðÔÉø¯é¾¯ø«ÂÂA½ðø¢½©ðL^·é
	for(int i=0;i<kazuSet.length;i++){
	    if(sum-kazuSet[i]>=0){
		sum = sum-kazuSet[i];
		suzi[i]++;
		i--;
	    }
	}
	//ãÌL^É]ÁÄMCXI¶ñðì¬B0Æ1Í\¦µÈ¢B
	for(int i=0; i<kazuSet.length; i++){
	    if(suzi[i]==1){
		mxci += list.get(i);
	    }else if(suzi[i]!=0){
		mxci += suzi[i] + list.get(i);
	    }
	}
	return mxci;
    }
}