import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	int check = 0;
      	String[] list = s.split("");
      	String[] list1 = new String[s.length()];
      	for(int i=0; i<s.length(); ++i){
          list1[s.length()-(1+i)] = list[i];
        }
      	int check1 = 0;
      	for(int i=0; i<s.length(); ++i){
          if(!(list[i].equals(list1[i]))){
            check1 = 1;
          }
        }
      	if(check1==0){
          check = check + 1;
        }
      	int num2 = (s.length()-1)/2;
      	String[] list2 = new String[num2];
      	for(int i=0; i<num2; ++i){
          list2[i] = list[i];
        }
      	String[] list2a = new String[num2];
      	for(int i=0; i<num2; ++i){
          list2a[num2-(1+i)] = list2[i];
        }
      	int check2 = 0;
      	for(int i=0; i<num2; ++i){
          if(!(list2[i].equals(list2a[i]))){
            check2 = 1;
          }
        }
      	if(check2==0){
          check = check + 1;
        }
      	int num3 = 1+s.length()-(s.length()+3)/2;
      	String[] list3 = new String[num3];
      	for(int i=0; i<num3; ++i){
          list3[i] = list[((s.length()+3)/2-1)+i];
        }
      	String[] list3a = new String[num3];
      	for(int i=0; i<num3; ++i){
          list3a[num3-(1+i)] = list3[i];
        }
      	int check3 = 0;
      	for(int i=0; i<num2; ++i){
          if(!(list3[i].equals(list3a[i]))){
            check3 = 1;
          }
        }
      	if(check3==0){
          check = check + 1;
        }
      	if(check==3){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}
