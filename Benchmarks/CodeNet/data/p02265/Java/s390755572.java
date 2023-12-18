import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
 class Main {
	public static void main(String[] args) throws Exception {
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(bufferedReader.readLine());
     Deque<Integer> Deque = new LinkedList<Integer>();
     for (int i = 0; i < n; i++) {
         String line = bufferedReader.readLine();

         if (line.startsWith("insert")) {
             Deque.offerFirst(Integer.parseInt(line.substring(line.indexOf(" ") + 1)));
         } else if (line.equals("deleteFirst")) {
             Deque.pollFirst();
         } else if (line.equals("deleteLast")) {
             Deque.pollLast();
         } else {
             Deque.remove(Integer.parseInt(line.substring(line.indexOf(" ") + 1)));
         }
     }

     StringBuilder stringBuilder = new StringBuilder();
     stringBuilder.append(Deque.poll());
     for (Integer s : Deque) {
         stringBuilder.append(" ").append(s);
     }
     System.out.println(stringBuilder.toString());

 }
}