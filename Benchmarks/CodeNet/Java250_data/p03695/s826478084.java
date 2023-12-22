import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    int num = Integer.parseInt(scan.next());
	    // scan.nextLine();

	    //ArrayList<String> colorList = new ArrayList<String>();
	    HashSet<String> colorSet = new HashSet<String>();
	    ArrayList<String> freeList = new  ArrayList<String>();
	    for(int i = 0; i < num; i++){
	    	String rate = checkRate(Integer.parseInt(scan.next()));
	    	if(rate.equals("自由")){
	    		freeList.add(rate);
	    	}else{
	    		colorSet.add(rate);
	    	}
	    }
	    int max = 0;
	    int min = 0;
	    int freeSize = freeList.size();
	    int colorSize = colorSet.size();
	    int nokoriColor = 8 - colorSize;

	    if(colorSize == 0){
	    	min = 1;
	    	max = freeSize;
	    }else{
	    	min = colorSize;
	    	max = freeSize + colorSize;
	    }


        /*
	    if(freeSize > 0){
	    	if(nokoriColor == 8){
	    		max = freeSize;
	    		min = 1;
	    	}
	    	if(freeSize > nokoriColor){
	    		max = 8;
	    		min = colorSize;
	    	}else if(freeSize < nokoriColor){
	    		max = colorSize + freeSize;
	    		min = colorSize;
	    	}else if(freeSize == nokoriColor){
	    		max = colorSize + freeSize;
	    		min = colorSize;
	    	}
	    }else{
	    	max = colorSize;
	    	min = colorSize;
	    }
	    */
	    System.out.println(min + " " + max);
	}

	// どのレートかチェックする
	public static String checkRate(int rateNum){
		String ret = "";
		if(1 <= rateNum && rateNum <= 399){
			ret = "灰色";
		}else if(400 <= rateNum && rateNum <= 799){
			ret = "茶色";
		}else if(800 <= rateNum && rateNum <= 1199){
			ret = "緑色";
		}else if(1200 <= rateNum && rateNum <= 1599){
			ret = "水色";
		}else if(1600 <= rateNum && rateNum <= 1999){
			ret = "青色";
		}else if(2000 <= rateNum && rateNum <= 2399){
			ret = "黄色";
		}else if(2400 <= rateNum && rateNum <= 2799){
			ret = "橙色";
		}else if(2800 <= rateNum && rateNum <= 3199){
			ret = "赤色";
		}else if(3200 <= rateNum){
			ret = "自由";
		}
		return ret;
	}
}