import java.util.*;

public class Main {
  static Map<Integer, Integer> wayRooms = new HashMap<>();
  
  // 0 なら未探索
  static Map<Integer, Integer> toOneRoomTime = new HashMap<>();
  static Set<Integer> searchedRoom = new HashSet();
  
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    // 1の部屋に何回でたどり着けるか
    for (int i = 1; i <= N; i ++) {
        wayRooms.put(i, 0);
        if (i != 1) {
            toOneRoomTime.put(i, 0);
        }
    }
    for (int i = 0; i < M; i ++) {
        int Ai = sc.nextInt();
        int Bi = sc.nextInt();
        wayRooms.put(Ai, Bi);
    }
    searchRooms(new HashSet<>(Arrays.asList(1)));
    boolean YesOrNo = toOneRoomTime.entrySet().stream().filter(e -> e.getValue() == 0).count() == 0;
    if (YesOrNo) {
      System.out.println("Yes");
      toOneRoomTime.entrySet().stream().forEach(e -> {System.out.println(e.getValue());});
    } else {
      System.out.println("No");
    }
  }
  
  public static void searchRooms(Set<Integer> searchRoomNum) {
    Set<Integer> nextSearchRooms = new HashSet<>();
    for (Integer num : searchRoomNum) {
      for (Map.Entry<Integer, Integer> e : wayRooms.entrySet()) {
        if (e.getKey() == num) {
          int toRoomNum = e.getValue();
          if (num == 1) {
              toOneRoomTime.put(toRoomNum, 1);
              nextSearchRooms.add(toRoomNum);
          } else if (toRoomNum != 1 && !searchedRoom.contains(toRoomNum)) {
              toOneRoomTime.put(toRoomNum, toOneRoomTime.get(num) + 1);
              nextSearchRooms.add(toRoomNum);
          }
          searchedRoom.add(toRoomNum);
        } else if (e.getValue() == num) {
          int toRoomNum = e.getKey();
          if (num == 1) {
              toOneRoomTime.put(toRoomNum, 1);
              nextSearchRooms.add(toRoomNum);
          } else if (toRoomNum != 1 && !searchedRoom.contains(toRoomNum)) {
              toOneRoomTime.put(toRoomNum, toOneRoomTime.get(num) + 1);
              nextSearchRooms.add(toRoomNum);
          }
          searchedRoom.add(toRoomNum);
        }
      }
    }
    
    if (nextSearchRooms.isEmpty()) {
      return;
    } else {
      searchRooms(nextSearchRooms);  
    }
  }
}