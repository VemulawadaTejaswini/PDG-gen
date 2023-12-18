class Solution{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    while(n > 0){
    	n -= 1000;
    }
    System.out.println(-n);
  }
}