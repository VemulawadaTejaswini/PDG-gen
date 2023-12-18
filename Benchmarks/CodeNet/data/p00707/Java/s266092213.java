import java.util.*;

class Main{
    static int w,h;
    static String[][] fieldS;
    static int[][] fieldI;
    static List<String> numList;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	numList = new ArrayList<String>();
	for(int i=0; i<10; i++){
	    String num = Integer.toString(i);
	    numList.add(num);
	}

	w = sc.nextInt();
	h = sc.nextInt();

	while(w!=0 && h!=0){
	    fieldS = new String[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    fieldS[i][j] = "";
		}
	    }
	    fieldI = new int[h][w];

	    for(int i=0; i<h; i++){
		String line = sc.next();
		for(int j=0; j<w; j++){
		    if(numList.contains(line.substring(j,j+1))){
			fieldI[i][j] = Integer.parseInt(line.substring(j,j+1));
		    }else{
			fieldI[i][j] = -1;
		    }
		}
	    }

	    String ans = solve();
	    if(!ans.equals("-1") && !ans.equals(""))System.out.println(ans);
	    else if(ans.equals("-1"))System.out.println(1);
	    else System.out.println(0);

	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static String solve(){
	String up = "";
	String left = "";
	boolean hantei = false;
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldI[i][j]!=-1){
		    hantei = false;
		    if(i-1>=0){up = fieldS[i-1][j]; hantei=true;}
		    if(j-1>=0){left = fieldS[i][j-1]; hantei=true;}
		    if(hantei ||(i==0 && j==0)){
			String select = getLargerOne(up,left);
			fieldS[i][j] = select + Integer.toString(fieldI[i][j]);
			if(fieldS[i][j].equals("0")){fieldS[i][j]="";}
			up = "";
			left = "";
		    }else {fieldS[i][j]=Integer.toString(fieldI[i][j]);}
		}
	    }
	}
	String max = getMax();
	return max;
    }

    public static String getLargerOne(String up, String left){

	if(up.length()>left.length()){return up;}
	else if(left.length()>up.length()){return left;}

	for(int i=0; i<up.length(); i++){
	    int upI = Integer.parseInt(up.substring(i,i+1));
	    int leftI = Integer.parseInt(left.substring(i,i+1));
	    if(upI>leftI){return up;}
	    else if(leftI>upI){return left;}
	}
	return up;
    }

    public static String getMax(){
	int maxLen = 0;
	List<String> sameLen = new ArrayList<String>();
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldS[i][j].length()>maxLen){
		    maxLen = fieldS[i][j].length();
		}
	    }
	}

	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldS[i][j].length()==maxLen){
		    sameLen.add(fieldS[i][j]);
		}
	    }
	}
	if(sameLen.size()==1){return sameLen.get(0);}
	int maxInt = 0;
	for(int i=0; i<maxLen; i++){
	    maxInt = 0;
	    for(int j=0; j<sameLen.size(); j++){
		String a = sameLen.get(j);
		//System.out.println(a);
		int num = Integer.parseInt(a.substring(i,i+1));
		if(num>maxInt){
		    maxInt = num;j=-1;
		}
		else if(num<maxInt){sameLen.remove(j); j--;}
		else if(num==maxInt && i==maxLen-1 && j==sameLen.size()-1){return sameLen.get(0);}
		if(sameLen.size()==1){return sameLen.get(0);}
	    }
	}
	return "-1";
    }
}