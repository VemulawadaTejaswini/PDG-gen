import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String, List<Integer>> Name_PointsMap = new HashMap<>();
        Map<Integer, Integer> Point_NoMap = new HashMap<>();
        List<String> cityList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int point = sc.nextInt();
            Point_NoMap.put(point, i);
            List<Integer> pointList = Name_PointsMap.get(name);
            if (Objects.isNull(pointList)) {
                pointList = new ArrayList<>();
            }
            pointList.add(point);
            Name_PointsMap.put(name, pointList);
            if (!cityList.contains(name)) {
                cityList.add(name);
            }
        }
        Collections.sort(cityList);
        for (String city : cityList) {
            List<Integer> points = Name_PointsMap.get(city);
            Collections.sort(points, Collections.reverseOrder());
            for (int pointss : points) {
                System.out.println(Point_NoMap.get(pointss));
            }
        }

    }
}
