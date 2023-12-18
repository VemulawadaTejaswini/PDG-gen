import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	int n=0,l=0,s=0,count=0,hikaeIn=0;
	int[] nArray = { 0,0,0,0 };
	int[] hikae = new int[4];
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){ // テ・ツ?・テ・ツ環崚」ツ?陛」ツつ古」ツ?ェテ」ツ?湘」ツ?ェテ」ツつ凝」ツ?セテ」ツ?ァ
	    
	    n = sc.nextInt();
	    count = 0;
	    if(n==0){ break; }
	    
	    while(true){
		
		if(n==6174){ System.out.println(count); break; }
		for(int i = 0;i<4;i++){ nArray[i] = 0;}
		l = 0; s = 0;

		hikae[0] = n%10;
		hikae[1] = (n/10)%10;
		hikae[2] = (n/100)%10;
		hikae[3] = n/1000;

		boolean check = false;
		for(int i = 0;i<4;i++){ // テ・ツ崢崚ヲツ。ツ?・ツ青古」ツ?佚」ツ?ォテ」ツ?ェテ」ツ?」テ」ツ?ヲテ」ツ??」ツ?ェテ」ツ??」ツ?凝ァツ「ツコティツェツ?
		    if(hikae[0]!=hikae[i]){ check=true; break; }
		}
		if(check==false){
		    System.out.println("NA");
		    break;
		}

		for(int i = 0;i<4;i++){ // テ・ツ、ツァテ」ツ?催」ツ??ゥツ??」ツ?ォテ、ツクツヲテ」ツ?ウテヲツ崢ソテ」ツ?暗」ツつ?
		    for(int j = 0;j<4;j++){
			if(nArray[i]<hikae[j]==true){
			    nArray[i] = hikae[j];
			    hikaeIn = j;
			}
		    }
		    hikae[hikaeIn] = 0;
		}

		// l
		l += nArray[3];
		l += nArray[2]*10;
		l += nArray[1]*100;
		l += nArray[0]*1000;

		// s
		s += nArray[0];
		s += nArray[1]*10;
		s += nArray[2]*100;
		s += nArray[3]*1000;

		n = l-s;

		count++;
		
	    }
	    
	}
    }
}