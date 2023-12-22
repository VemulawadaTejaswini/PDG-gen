import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int [] in = new int [a];
        String [] str = new String [a];
        for(int i=0;i<a;i++){str[i] = sc.next();
                            }
        Arrays.sort(str);
        int b = 0;
        int c = 1;
        for(int i=0;i<a;i++){if(i>=1 && str[i].equals(str[i-1])){in[b]++;if(in[b]>c){c = in[b];}
                                                 
                                                                }else{b=i;in[i]++;}
                            }
        for(int i=0;i<a;i++){if(in[i]==c){System.out.println(str[i]);}
                              }
		
	}
}
