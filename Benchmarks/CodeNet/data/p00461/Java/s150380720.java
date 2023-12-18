import java.util.*;
//üespectüü³ñÌideaðQlipNjÉµ½
//IOIªÇÌ­ç¢±¢Ä¢éÌ©ðzñansÉÛ¶µ»ÌÈ©Åðð½µÄ¢éàÌð¦ã°½

class Main{

    public static void main(String[] args){
	int n,m,cou=0;
	String s;
       

	Scanner nariyoshitool = new Scanner(System.in);

	while(true){
	n = nariyoshitool.nextInt();
	if(n == 0)break;
	m = nariyoshitool.nextInt();
	if(m == 0){}
	s = nariyoshitool.next();
	char c[] = s.toCharArray();
	int[] ans = new int[m];
	//Arrays.fillÍC++Å¢¤memset
	Arrays.fill(ans,0);

	for(int i=0;i<s.length()-2;i++){
	    if(c[i] == 'I' && c[i+1] == 'O' && c[i+2] == 'I'){
		ans[i+2]=ans[i]+1;//±±dv
	    }
	}
	for(int i=0;i<m;i++){
	    if(ans[i]>=n)cou++;
	}
	System.out.println(cou);
	cou=0;


	}




    }

}