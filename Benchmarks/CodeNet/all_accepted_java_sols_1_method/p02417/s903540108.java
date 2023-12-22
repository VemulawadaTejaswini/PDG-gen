import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] Box = new int[26];
        while(sc.hasNext()){
       		String s = sc.nextLine();
        	s = s.toLowerCase();
            
            	for(int i=0;i<s.length();i++){
                    char Alfa = 'a';
                    for(int j=0;j<=('z'-'a');j++){
                        if(s.charAt(i) == Alfa++)
                            Box[j]++;
                    }
                }
        }
       char  Alfa = 'a';
            for(int k=0;k<=('z'-'a');k++){
            System.out.println(Alfa++ + " : " + Box[k]);
            }
    }
}
