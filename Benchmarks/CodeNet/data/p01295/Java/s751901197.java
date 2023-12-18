import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	while(true){

	    int n = scan.nextInt();
	    int k = scan.nextInt();

	    if(n == 0 && k == 0){
		break;
	    }

	    int datal = 0;
	    int them;

	    String s1;

	    String n1 = String.valueOf(n);
	    int nlength = n1.length();
	    
	    if(nlength >= 2){
		datal += 9;
	    }	    
	    if(nlength >= 3){
		datal += 180;
	    }
	    if(nlength >= 4){
		datal += 2700;
	    }
	    if(nlength >= 5){
		datal += 36000;
	    }
	    if(nlength >= 6){
		datal += 450000;
	    }
	    if(nlength >= 7){
		datal += 5400000;
	    }
	    if(nlength >= 8){
		datal += 63000000;
	    }
	    if(nlength >= 9){
		datal += 720000000;
	    }
	    
	    for(int i = 10 * (nlength-1) + 1;; i++){
		s1 = String.valueOf(i);
		datal += s1.length();

		if(n <= datal){
		    them = i;
		    s1 = String.valueOf(i);
		    break;
		}
	    }


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
		break;
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