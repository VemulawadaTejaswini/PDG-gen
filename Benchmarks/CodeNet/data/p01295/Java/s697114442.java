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
	    
	     if(n > 9){
		datal += 9;
		start = 10;
	    }	    
	    if(n > 189){
		datal += 180;
		start = 100;
	    }
	    if(n > 2889){
		datal += 2700;
		start = 1000;
	    }
	    if(n > 38700){
		datal += 36000;
		start = 10000;
	    }
	    if(n > 486000){
		datal += 450000;
		start = 100000;
	    }
	    if(n > 5850000){
		datal += 5400000;
		start = 100000;
	    }
	    if(n > 68400000){
		datal += 63000000;
		start = 10000000;
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