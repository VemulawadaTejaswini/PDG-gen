import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	while(true){

	    int n = scan.nextInt();
	    int k = scan.nextInt();

	    if(n == 0 || k == 0){
		break;
	    }

	    int datal = 0;
	    int them;

	    String s1;
	    //ツつアツつアツつゥツづァ

	    	    
	    int start = 1;
	    if(n > 68888889){
		datal = 68888889;
		start = 10000000;
	    }else if(n > 5888889){
		datal = 5888889;
		start = 100000;
	    }else if(n > 488889){
		datal = 488889;
		start = 100000;
	    }else if(n > 38889){
		datal = 38889;
		start = 10000;
	    }else if(n > 2889){
		datal = 2889;
		start = 1000;
	    }else if(n > 189){
		datal = 189;
		start = 100;
	    }else if(n > 9){
		datal += 9;
		start = 10;
	    }	   
	    //System.out.println("datal = "+ datal);
	    
	    for(int i = start;; i++){
		s1 = String.valueOf(i);
		datal += s1.length();

		if(n <= datal){
		    them = i;
		    s1 = String.valueOf(i);


		    //System.out.println("n = " + n);
		    //System.out.println("them = " + them);
		    //System.out.println("datal = " + datal);

		    break;
		}
	    }

	    //ツつアツつアツづ慊づづーツ陛渉更

	    int disp = 0;

	    for(int i = s1.length()-(datal - n)-1; i < s1.length(); i++){
		System.out.print(s1.charAt(i));
		disp++;
		if(disp == k){
		    break;
		}
	    }

	    if(disp == k){
		System.out.println();
		continue;
	    }


	    int check = 0;

	    for(int i = them+1;;i++){
		s1 = String.valueOf(i);
		for(int j = 0; j < s1.length();j++){
		    System.out.print(s1.charAt(j));
		    disp++;
		    if(disp == k){
			check = -1;
			break;
		    }

		}

		if(check == -1) break;
	    }

	    System.out.println();
	    

	}
    }
}