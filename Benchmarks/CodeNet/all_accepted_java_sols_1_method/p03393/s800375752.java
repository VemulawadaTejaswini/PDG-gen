import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 String s = sc.next();
 char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 if(s.length() < 26) {
	 char ad = 0;
	 for(int i = 0;i < 26;i++) {
		 boolean dif = true;
		 for(int j = 0;j < s.length();j++) {
			 if(alp[i] == s.charAt(j)) {
				 dif = false;
				 break;
			 }
			 else dif = true;
			 }if(dif) {
				 ad = alp[i];
				 break;
			 }
			 }
	 System.out.print(s);
	 System.out.println(ad);
		 }
 else if(s.length() == 26) {
	 if(s.equals( "zyxwvutsrqponmlkjihgfedcba"))System.out.println("-1");
	 else {
		 int swap = -1;
		 for(int i = 25;i > 0;i--) {
			 int a = -1;
			 int b = -1;
			 for(int j = 0;j < 26;j++) {
				 if(s.charAt(i) == alp[j]) {
					 a = j;
					 break;
				 }
			 }
			 for(int j = 0;j < 26;j++) {
				 if(s.charAt(i-1) == alp[j]) {
					 b = j;
					 break;
				 }
			 }
			 if(a > b) {
				 swap = i-1;
				 break;
			 }
			 
		 }
		 int min = 25;
		 if(swap == 0) {min = 25;
		 int swapin = -1;
		 for(int j = 0;j < 26;j++) {
			 if(s.charAt(swap) == alp[j]){
				 swapin = j;
			 }
		 }
		 for(int i = swap+1;i < 26;i++) {
			 for(int j = 0;j < 26;j++) {
				 if(s.charAt(i) == alp[j]){
					 if(j > swapin)
					 min = Math.min(min,j);
				 }
			 }
		 }
			 System.out.println(alp[min]);
		 }
		 else {
			 min = 25;
			 int swapin = -1;
			 for(int j = 0;j < 26;j++) {
				 if(s.charAt(swap) == alp[j]){
					 swapin = j;
				 }
			 }
			 for(int i = swap+1;i < 26;i++) {
				 for(int j = 0;j < 26;j++) {
					 if(s.charAt(i) == alp[j]){
						 if(j > swapin)
						 min = Math.min(min,j);
					 }
				 }
			 }
			 System.out.print(s.substring(0,swap));
			 System.out.println(alp[min]);
	 }
	 }
	 
 }
	 }
 }
